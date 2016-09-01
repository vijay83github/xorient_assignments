package com.xorient.test.q2;

public interface Pool<T> {
	T get();

	void release(T t);

	void shutdown();

	public static interface Validator<T> {
		public boolean isValid(T t);

		public void invalidate(T t);
	}

}
