package luv2code;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	// to solve the MyApp error
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {	
		return "Just do it: " + fortuneService.getFortune();
	}

}
