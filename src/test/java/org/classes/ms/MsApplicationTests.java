package org.classes.ms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.times;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;


@RunWith(PowerMockRunner.class)
@PrepareForTest({SpringApplication.class})
public class MsApplicationTests {

	@Test
	public void mainMustCallRunMethod() {
		//Arrange
		String[] args = new String[0];
		mockStatic(SpringApplication.class);

		//act
		MsApplication.main(args);

		//Assert
		verifyStatic(SpringApplication.class,times(1));
		SpringApplication.run(MsApplication.class, args);

	}

}

