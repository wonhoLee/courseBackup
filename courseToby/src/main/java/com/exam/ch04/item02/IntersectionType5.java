package com.exam.ch04.item02;

import java.util.function.Consumer;
import java.util.function.Function;

public class IntersectionType5 {
	interface Pair<T> {
		T getFirst();
		T getSecond();
		void setFirst(T first);
		void setSecond(T second);
	}
	
	static class Name implements Pair<String>{
		String firstName;
		String lastName;

		public Name(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String getFirst() {
			return this.firstName;
		}

		@Override
		public String getSecond() {
			return this.lastName;
		}

		@Override
		public void setFirst(String first) {
			this.firstName = first;
		}

		@Override
		public void setSecond(String second) {
			this.lastName = second;
		}
		
	}
	
	interface ForwardingPair<T> extends DelegateTo<Pair<T>>, Pair<T> {
		default T getFirst() {
			return delegate().getFirst();
		}
		default T getSecond() {
			return delegate().getSecond();
		}
		default void setFirst(T first) {
			delegate().setFirst(first);
		}
		default void setSecond(T second) {
			delegate().setSecond(second);
		}
	}
	
	interface DelegateTo<T>{
		T delegate();
	}
	
	private static <T extends DelegateTo<S>, S> void run(T t, Consumer<T> consumer) {
		consumer.accept(t);
	}
	
	interface Convertable<T> extends DelegateTo<Pair<T>>{
		default void convert(Function<T,T> mapper) {
			Pair<T> pair = delegate();
			pair.setFirst(mapper.apply(pair.getFirst()));
			pair.setSecond(mapper.apply(pair.getSecond()));
		}
	}
	
	/*static <T> void print(Pair<T> pair) {
		System.out.println(pair.getFirst() + " " + pair.getSecond());
	}*/
	
	interface Printable<T> extends DelegateTo<Pair<T>>{
		default void print() {
			System.out.println(delegate().getFirst() + " " + delegate().getSecond());
		}
	}
	
	public static void main(String[] args) {
		Pair<String> name = new Name("test", "Won");
		run((ForwardingPair<String> & Convertable<String> & Printable<String>)()->name, o->{
			/*System.out.println(o.getFirst());
			System.out.println(o.getSecond());*/
			o.print();
			o.convert(s->s.toUpperCase());
			o.print();
			o.convert(s->s.substring(0,2));
			o.print();
		});
	}

}
