package edu.jecrc.sdt_java.class_object;

import java.util.Objects;

public class Student {
	int id;
	String brand;
	String name;
	double price;
	@Override
	public String toString() {
		return "Student [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(brand, other.brand) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
