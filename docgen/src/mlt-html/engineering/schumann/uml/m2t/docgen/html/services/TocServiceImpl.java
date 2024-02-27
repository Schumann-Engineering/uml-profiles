package engineering.schumann.uml.m2t.docgen.html.services;

import engineering.schumann.uml.docgen.DocGenFactory;
import engineering.schumann.uml.docgen.TocEntry;

public class TocServiceImpl {
	public final static String DEFAULT_BREADCRUMBS_DELIMITER = " > ";

	
	private TocEntry m_TableOfContentsRoot = null;
	

	private TocEntry m_LastEntry= null;

	
	public void Add(
			String	displayText,
			Integer	level
		)
	throws
		Exception
	{
		var newEntry = DocGenFactory.eINSTANCE.createTocEntry();
		newEntry.setDisplayText(displayText);
		
		Add(newEntry, level);
	}
	
	
	public void Add(
		TocEntry newEntry,
		Integer level
	)
	throws
		Exception
	{
		// === GUARDS ===
		if (newEntry == null)
			return;
		if (newEntry.getDisplayText() == null || newEntry.getDisplayText().isBlank())
			throw new Exception("new entry does not have a display name");
		
		// === BODY ===
		// move last entry accordingly
		while (m_LastEntry != null)
		{
			// RULE: if level is larger than top entry, add it, if possible
			if (m_LastEntry.depth() + 1 == level)
			{
				m_LastEntry.getChild().add(newEntry);
				break;
			}

			// RULE: if level is smaller or equal than top entry, then pop enough
			//       entries for the level to fit
			if (m_LastEntry.depth() >= level)
			{
				while (m_LastEntry != null && m_LastEntry.depth() >= level)
					m_LastEntry = m_LastEntry.getParent();
				continue;
			}
			
			// RULE: if level is larger than top entry, just chek the level
			// GUARD: ensure there is no jump in level! 
			if (m_LastEntry.depth() + 1 != level)
				throw new Exception(String.format(
					"mismatch in level detected! last entry: '%s' has level %d; new entry: '%s' has level %d",
					m_LastEntry.getDisplayText(),
					m_LastEntry.depth(),
					newEntry.getDisplayText(),
					level
				));
		
			// found "correct" entry
			break;
		}
		
		// add to parent
		if (m_LastEntry != null)
			newEntry.setParent(m_LastEntry);
		// ... or toc
		else if (m_TableOfContentsRoot == null)
			m_TableOfContentsRoot = newEntry;
		else if (m_TableOfContentsRoot != null)
			throw new Exception("Table of Contents is only allowed to have one root / level-1 element");

		// advance
		m_LastEntry = newEntry;
		
		/*
		System.out.println(String.format(
				"DEBUG: [Toc] NEW: <h%d> %s",
				newEntry.depth(),
				newEntry.getDisplayText()
			));
		System.out.flush();
		*/
	}
	
	
	public void clearToc()
	{
		m_TableOfContentsRoot = null;
		m_LastEntry = null;
		/*
		System.out.println("DEBUG: [Toc] CLEAR");
		System.out.flush();
		*/
	}
	
	
	public TocEntry getLastEntry()
	{
		return m_LastEntry;
	}
	
	
	public TocEntry getToc()
	{
		return m_TableOfContentsRoot;
	}
}
