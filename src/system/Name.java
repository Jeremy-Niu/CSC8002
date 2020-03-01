/**
 * 
 */
package system;

/**
 * @author niule
 *
 */
public final class Name {

	private String firstName;
	private String lastName;
	
	
	/**
	 * 
	 */
	public Name(String firstName, String lastName) {
		 setFirstName(firstName);
	     setLastName(lastName);
	}

	 private void setLastName(String lastName) {
		 if (lastName.length() == 0)
	            throw new IllegalArgumentException("Empty last name");
	        
	     this.lastName = lastName;
		
	}

	private void setFirstName(String firstName) {
		if (firstName.length() == 0)
            throw new IllegalArgumentException("Empty first name");
        
        this.firstName = firstName;	
	}

	public String getFirstName() { return firstName; }
	 
	public String getLastName() { return lastName; }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        
        if (!(obj instanceof Name))
            return false;
        
        final Name name = (Name) obj;
        
        // note: firstName and lastName are guaranteed
        // non-null at construction, no need to check here
        return firstName.equals(name.firstName)
                && lastName.equals(lastName);
		
	}
	
	 @Override
	    public int hashCode() {
	        int hc = 17;
	        
	        hc = 37 * hc + firstName.hashCode();
	        
	        return 37 * hc + lastName.hashCode();
	}
	 
	 @Override
	    public String toString() {
	        return firstName + " " + lastName;
	}
	
	
}
