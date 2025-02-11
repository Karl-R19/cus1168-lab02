package academy.javapro;


public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        Tesla myTesla = new Tesla("Model S", 2024);

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        System.out.println(myTesla.getMake() + " " + myTesla.getModel()  +" "+ myTesla.getYear() );
        System.out.println("Running: " + (myTesla.isRunning() ? "true" : "false"));
        System.out.println("Autopilot: " + (myTesla.isAutopilotEnabled() ? "true" : "false"));
        System.out.println("Charging: " + (myTesla.isCharging() ? "true" : "false"));

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        myTesla.startEngine();   // Start car
        myTesla.accelerate();    // Accelerate
        myTesla.brake();         // Brake

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        myTesla.enableAutopilot();  // Enable autopilot
        System.out.println("Autopilot: " + (myTesla.isAutopilotEnabled() ? "true" : "false"));
        myTesla.disableAutopilot(); // Disable autopilot

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        myTesla.charge();          // Start charging
        System.out.println("Charging: " + (myTesla.isCharging() ? "true" : "false"));

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        myTesla.stopEngine();  // Stop car
        System.out.println("Running: " + (myTesla.isRunning() ? "true" : "false"));
    }
}
