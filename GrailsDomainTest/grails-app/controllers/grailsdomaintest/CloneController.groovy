package grailsdomaintest

class CloneController {

	def cloneObjService
	
    def index() { 
		cloneObjService.serviceMethod()
	}
}
