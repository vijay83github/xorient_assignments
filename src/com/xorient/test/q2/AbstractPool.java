package com.xorient.test.q2;

public abstract class AbstractPool<T> implements Pool<T> {
	 @Override
	 public final void release(T t)
	 {
	  if(isValid(t))
	  {
	   returnToPool(t);
	  }
	  else
	  {
	   handleInvalidReturn(t);
	  }
	 }
	 
	 protected abstract void handleInvalidReturn(T t);
	 
	 protected abstract void returnToPool(T t);
	 
	 protected abstract boolean isValid(T t);
}
