package oopsstatment;

public class Switch {
	public static void main(String[] args)
	{
		switch("ss"){//output expression
	
	case"Idle":{//false
		System.out.println("on monday");
		break; //jvm stops execution
		
	}
	case "Dosa":{//true
		System.out.println("on tuesday");
		break; //jvm stops execution
		
	}
	default:{
		System.out.println("No chatney");
	}
}
	}
}
