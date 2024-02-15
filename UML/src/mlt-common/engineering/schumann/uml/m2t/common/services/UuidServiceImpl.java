package engineering.schumann.uml.m2t.common.services;

import java.util.UUID;

public class UuidServiceImpl {

	public static String GenerateUuid()
	{
		var result = UUID.randomUUID();
		
		return result.toString();
	}
}
