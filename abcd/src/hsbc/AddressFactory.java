package hsbc;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressFactory {
	public Address getAdd1() {
		return new Address("building 123", "city 123", "street 123");
	}

	public Address getAdd2() {
		return new Address("building 2", "city 2", "street 2");
	}

}
