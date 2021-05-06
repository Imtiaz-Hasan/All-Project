package interfaces;
import java.lang.*;
import classes.*;
public interface LibraryOperation
{
	void insertLibrary(Library l);
	void removeLibrary(Library l);
	Library getLibrary(String address);
	void showAlllibraries();
	
}