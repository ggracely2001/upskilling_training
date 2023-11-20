package com.cg.oops;

abstract class Persistence{
	abstract public String persist();
}
class FilePersistence extends Persistence{
	public String persist() {
		return "File persistence class called";
	}
}
class DatabasePersistence extends Persistence{
	public String persist() {
		return "Database persistence class called";
	}
}
public class Client {

	public static void main(String[] args) {
		Persistence persistence = new FilePersistence();
		System.out.println(persistence.persist());
	}
}
