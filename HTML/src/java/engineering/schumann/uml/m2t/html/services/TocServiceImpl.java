package engineering.schumann.uml.m2t.html.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

public class TocServiceImpl {
	public final static String DEFAULT_BREADCRUMBS_DELIMITER = " > ";
	
	
	public class Entry extends BasicEObjectImpl {
		public String name = null;
		
		public String id = null;
		
		public int level = 0;
		
		@Override
		public String toString() {
			return String.format("'%s' (level %d)", name, level);
		}
	}
	
	
	private List<Entry> TableOfContents = new ArrayList<Entry>();
	
	private Stack<Entry> Breadcrumbs = new Stack<Entry>();
	
	
	protected Entry createEntry() { return new Entry(); }
	
	
	
	public void Add(
		String	name,
		String	id,
		Integer	level
	)
	throws
		Exception
	{
		var newEntry = new Entry(); //INSTANCE.createEntry();
		newEntry.level = level;
		newEntry.id = id;
		newEntry.name = name;
		
		Add(newEntry);
	} 
	
	
	public void Add(
		Entry newEntry
	)
	throws
		Exception
	{
		// === GUARDS ===
		if (newEntry == null)
			return;
		if (newEntry.level <= 0)
			throw new Exception(String.format(
				"level of new entry '%s' must be at least 1. Found %d",
				newEntry.name,
				newEntry.level
			));
		if (newEntry.name == null || newEntry.name.isBlank())
			throw new Exception("new entry does not have a name");
		
		// === BODY ===
		// prepare the stack to accommodate new entry
		if (!Breadcrumbs.isEmpty())
		{
			var lastEntry = Breadcrumbs.peek(); 
			
			// RULE: if level is same as top entry, then replace top
			//       entry
			if (lastEntry.level == newEntry.level)
			{
				Breadcrumbs.pop();
			}
			else
			// RULE: if level is larger than top entry, just chek the level
			if (lastEntry.level < newEntry.level)
			{
				// GUARD: ensure there is no jump in level! 
				if (lastEntry.level + 1 != newEntry.level)
					throw new Exception(String.format(
						"mismatch in level detected! last entry: '%s' has level %d; new entry: '%s' has level %d",
						lastEntry.name,
						lastEntry.level,
						newEntry.name,
						newEntry.level
					));
			}
			else
			// RULE: if level is smaller than top entry, then pop enough
			//       entries for the level to fit
			if (lastEntry.level > newEntry.level)
			{
				while (!Breadcrumbs.isEmpty() && Breadcrumbs.peek().level >= newEntry.level)
					Breadcrumbs.pop();
			}
		}

		// GUARD: first entry on stack need to be level 1
		if (Breadcrumbs.isEmpty() && newEntry.level != 1)
			throw new Exception(String.format(
					"level of new entry '%s' must be at least 1. Found %d",
					newEntry.name,
					newEntry.level
				));
		
		// GUARD: ensure id is set, otherwise automatically determine it based on stack
		if (newEntry.id == null || newEntry.id.isBlank() )
		{
			// FIXME: the assumption is, that a document only has 1 level 1 entry = title. we should ignore that for breadcrumbs. Hence, we start with level 2
			var breadcrumbs = toList(2);
			breadcrumbs.add(newEntry.name);
			newEntry.id = String.join(DEFAULT_BREADCRUMBS_DELIMITER, breadcrumbs);
		}
		
		// finally add the entry
		Breadcrumbs.push(newEntry);
		// also add it to TOC. With this, we are automatically getting the list of entries. :)
		TableOfContents.add(newEntry);
	}
	
	
	@Override
	public String toString()
	{ 
		return toString(DEFAULT_BREADCRUMBS_DELIMITER); 
	}
	
	
	public String toString(
			String delimiter
	)
	{
		// === GUARDS ===
		if (Breadcrumbs.isEmpty())
			return null;
		
		// === RESULT ===
		return String.join(delimiter, toList());
	}
	
	
	public List<String> toList()
	{
		return toList(0);
	}
	
	
	public List<String> toList(
		Integer minimumLevel
	)
	{
		// === BODY ===
		var entries = new ArrayList<String>();

		if (Breadcrumbs.isEmpty())
			return entries;
		
		for (var entry : Breadcrumbs)
			if (entry.level >= minimumLevel)
				entries.add(entry.name);
		
		// === RESULT ===
		return entries;
	}
	
	
	public List<String> toListSkipLast(
		Integer minimumLevel
	)
	{
		return toListSkipLastN(minimumLevel, 1);
	}
	
	
	public List<String> toListSkipLastN(
		Integer minimumLevel,
		Integer skipCount
	)
	{
		// === BODY ===
		var entries = new ArrayList<String>();

		if (Breadcrumbs.isEmpty())
			return entries;
		
		for (int i=0; i<Breadcrumbs.size() - Math.max(0,  skipCount); i++)
		{
			var entry = Breadcrumbs.get(i);
			
			if (entry.level >= minimumLevel)
				entries.add(entry.name);
		}
		
		// === RESULT ===
		return entries;
	}
	public List<List<String>> getToc()
	{
		var result = new ArrayList<List<String>>();
		
		for (var entry : TableOfContents)
			result.add(Arrays.asList(
				entry.name, 
				entry.id,
				Integer.toString(entry.level)
			));
		
		return result;
	}
	
	
	public void initToc()
	{
		TableOfContents.clear();
		Breadcrumbs.clear();
	}
}
