import java.util.Random;

public class Slotted_ALOHA {
        private static final int NUM_DEVICES = 10; // Number of devices in the network
        private static final int NUM_SLOTS = 100; // Number of time slots for simulation
        private static final double PROBABILITY_OF_SENDING = (double)1/NUM_DEVICES; // Probability of a device sending a frame

        public static void main(String[] args) {
            System.out.println("Total number of devices: " + NUM_DEVICES);
            System.out.println("prob of sending: " + PROBABILITY_OF_SENDING);
            simulateSlottedAloha();

        }

        private static void simulateSlottedAloha() {
            Random random = new Random();
            int[] devices = new int[NUM_DEVICES];
            int successfulTransmissions = 0;

            for (int slot = 0; slot < NUM_SLOTS; slot++) {
                // Check if each device sends a frame with the given probability
                for (int i = 0; i < NUM_DEVICES; i++) {
                    if (random.nextDouble() < PROBABILITY_OF_SENDING) {
                        devices[i] = 1; // Device i sends a frame
                        System.out.println("device " + devices[i] + " sent a frame...");
                    } else {
                        devices[i] = 0; // Device i does not send a frame
                        System.out.println("device " + devices[i] + " did not send a frame...");
                    }
                }

                // Count the number of devices that sent a frame in this slot
                int numTransmissions = countTransmissions(devices);
                System.out.println("Total number of transmissions: " + numTransmissions);

                // If only one device sent a frame, it was a successful transmission
                if (numTransmissions == 1) {
                    successfulTransmissions++;
                } else {
                    System.out.println("No collision");
                }
            }

            double throughput = (double) successfulTransmissions / NUM_SLOTS;
            System.out.println("Successful Transmission: " + successfulTransmissions);
            System.out.println("Total number of rounds or slots for Transmission: " + NUM_SLOTS);
            System.out.println("Slotted ALOHA throughput: " + throughput);
        }


    private static int countTransmissions(int[] devices) {
            int count = 0;
            for (int device : devices) {
                if (device == 1) {
                    count++;
                }
            }
            return count;
        }
    }
