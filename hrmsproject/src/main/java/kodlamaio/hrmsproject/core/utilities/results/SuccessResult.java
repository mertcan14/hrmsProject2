package kodlamaio.hrmsproject.core.utilities.results;

public class SuccessResult extends Result{

	public SuccessResult(String messages) {
		super(true, messages);
	}
	
	public SuccessResult() {
		super(true);
	}

}
