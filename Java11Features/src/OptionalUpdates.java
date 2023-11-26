import java.util.Optional;

public class OptionalUpdates {

	public static void main(String[] args) {
//		Optional<String> str = Optional.empty();
		Optional<String> str = Optional.of("test");
		
//		if (str.isPresent()) {};
		System.out.println(str.isEmpty());
		
	}

}
