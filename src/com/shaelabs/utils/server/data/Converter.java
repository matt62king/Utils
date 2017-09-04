package com.shaelabs.utils.server.data;

/**
 * Class for data conversion
 * 
 * @author Matt
 * @since 0.1
 */
public abstract class Converter<FROM, TO> {
	
	protected abstract TO forward(FROM input);
	
	protected abstract FROM backwords(TO input);
	
	public Converter<TO, FROM> reverse() {
		return new ReverseConveter<FROM, TO>(this);
	}
	
	public TO convert(FROM from) {
		return forwardImpl(from);
	}
	
	TO forwardImpl(FROM input) {
		return forward(input);
	}
	
	FROM backwardsImpl(TO input) {
		return backwords(input);
	}
	
	private static final class ReverseConveter<FROM, TO> extends Converter<TO, FROM> {

		private Converter<FROM, TO> converter;
		
		ReverseConveter(Converter<FROM, TO> converter) {
			this.converter = converter;
		}

		@Override
		protected FROM forward(TO input) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected TO backwords(FROM input) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		FROM forwardImpl(TO input) {
			return converter.backwords(input);
		}
		
		@Override
		TO backwardsImpl(FROM input) {
			return converter.forward(input);
		}
	}
}
