package test.application;

import org.springframework.stereotype.Component;

@Component
public class BerbicaraImpl implements Berbicara{
	@Override
	public String katakan(){
		return "Helo sahrul.....";
	}

}
