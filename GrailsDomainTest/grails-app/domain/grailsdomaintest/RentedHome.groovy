package grailsdomaintest

class RentedHome {

	String roomNumber
	String streetName
	String city
	String state

	
	static mappedBy = [rentedMember : 'rentedHome'] 
	
	static hasMany = [rentedMember : Person]
	
    static constraints = {
    }
}
