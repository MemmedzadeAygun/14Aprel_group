package stream;

@FunctionalInterface
public interface LearnToSpeak {
	void speak(String sound);
	
	default void doIt() {
	}
}
