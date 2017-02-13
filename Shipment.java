import java.util.Scanner;

public class Shipment {

	
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		(new Simulator()).start();
		
		System.out.println("Please Enter The Shippment Id");
		String id = scanner.next();
		try{
		ShipmentDetails UID = new ShipmentDetails(Double.parseDouble(id));
		System.out.println("                                                    FedEx Tracking Details");
		System.out.print("Ship Date :"+UID.getShipmentDetails().getShippmentBookedDate());
		System.out.println("                                                                                         Delivery Date :"+UID.getShipmentDetails().getDeliveryDate());
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("Source : "+UID.getShipmentDetails().getStartCity());
		System.out.print("                                      Shiping Status : "+UID.getShipmentDetails().getShipStatus()+"                                ");
		System.out.println("Destination : "+UID.getShipmentDetails().getDestination());
		System.out.println("");
		System.out.print("Current Package Position : "+UID.getShipmentDetails().getCurrentNode());
		System.out.print("                              Source to Destination distance : "+UID.getShipmentDetails().getDistance()+"                               ");
		System.out.println("Signed for by :"+UID.getShipmentDetails().getName());
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Shipping Facts");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.print("Tracking Number : "+UID.getShipmentDetails().getShipingID());
		System.out.println("                                Service : FedEx Home Delivery");
		System.out.print("Weight : "+UID.getShipmentDetails().getWeight());
		System.out.println("                                          Dimensions: "+UID.getShipmentDetails().getDimensions());
		System.out.print("Signature Services : Direct Signature Required");
		System.out.println("         Special Handling Section : Direct Signature Required");
		System.out.println("Packaging : Package");
		
		Shipment.main(null);
		}
		catch(Exception e){
			System.out.println("Please enter only Number values");
			System.out.println(e);
			Shipment.main(null);
			
		}
		
		
	}
	
}
