package paymentAppsPolymorphism;

public class Card extends Payment {
	public void pay() {
		System.out.println("Payment done using Card");
	}
}
