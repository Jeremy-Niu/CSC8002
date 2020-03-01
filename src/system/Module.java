/**
 * 
 */
package system;

import java.rmi.server.ExportException;

/**
 * @author niulei
 *
 */
public class Module {

	private String moduleName;
	private String moduleCode;
	private int credit;
	
	
	
	public String getModuleName() {
		return moduleName;
	}



	public String getModuleCode() {
		return moduleCode;
	}



	public int getCredit() {
		return credit;
	}


	/**
	 * @throws ExportException 
	 * 
	 */
	public Module(String modulename, String modulecode, int credit) {
		// TODO Auto-generated constructor stub
		if(modulename == null)
			throw new IllegalArgumentException("The modulename could not be empty!");
		
		if(modulecode == null)
			throw new IllegalArgumentException("The moduleco could not be empty! ");
		
		if (credit == 0 )
			throw new IllegalArgumentException("The moduleco could not be zero! ");
		
		
		this.moduleName = modulename;
		this.moduleCode = modulecode;
		this.credit = credit;		
	}
	
	

}
