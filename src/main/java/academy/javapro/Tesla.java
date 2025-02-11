package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
	private boolean autopilotEnabled;
	private boolean charging;

	public Tesla(String model, int year) {
		super("Tesla", model, year);
		this.autopilotEnabled = false;
		this.charging = false;
	}

	// staartEngine method from Vehicle class
	public void startEngine() {
		if (!isRunning) {
			isRunning = true;
			System.out.println("Tesla started.");

		} else {
			System.out.println("Tesla is already running.");
		}
	}

	// stopEngine method from Vehicle class
	@Override
	public void stopEngine() {
		if (isRunning) {
			isRunning = false;
			System.out.println("Tesla stopped.");
		} else {
			System.out.println("Tesla is already off.");
		}
	}

	// accelerate method from Vehicle class
	@Override
	public void accelerate() {
		if (isRunning) {
			System.out.println("Tesla is accelerating.");
		} else {
			System.out.println("Start the tesla first before accelerating.");
		}
	}

	// brake method from Vehicle class
	@Override
	public void brake() {
		if (isRunning) {
			System.out.println("Tesla is braking.");
		} else {
			System.out.println("Start the engine first before braking.");
		}
	}

	// charge method from Electric class
	@Override
	public void charge() {
		if (!charging) {
			charging = true;
			System.out.println("Tesla is charging.");
		} else {
			System.out.println("Tesla is already charging.");
		}
	}

	// isCharging method from Electric class
	@Override
	public boolean isCharging() {
		return charging;
	}

	// enableAutopilot method from Autonomous class
	@Override
	public void enableAutopilot() {
		if (!autopilotEnabled) {
			autopilotEnabled = true;
			System.out.println("Autopilot enabled.");
		} else {
			System.out.println("Autopilot is already enabled.");
		}
	}

	// disableAutopilot method from Autonomous class
	@Override
	public void disableAutopilot() {
		if (autopilotEnabled) {
			autopilotEnabled = false;
			System.out.println("Autopilot disabled.");
		} else {
			System.out.println("Autopilot is already disabled.");
		}
	}

	// isAutopilotEnabled method from Autonomous class
	@Override
	public boolean isAutopilotEnabled() {
		return autopilotEnabled;
	}
}
