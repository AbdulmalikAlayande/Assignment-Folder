package Abdulmalikjavaproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hotel.Hotel;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
	Hotel hotel = new Hotel(10);
	
	@BeforeEach
	void startAllTestWith() {
		assertNotNull(hotel);
	}
	
	@Test
	void getAllRoomsTest() {
		assertEquals(10, hotel.getRooms());
	}                                                                                                                                    
	
	@Test
	void testThatRoomCanBeBooked() {
		hotel.bookRoom("Bola");
		assertEquals("Rooms successfully Booked by" + " Bola" + "!!!", hotel.bookRoom("Bola"));
	}
	
	@Test
	void TestThatUserCanCheckOut() {
		hotel.bookRoom("Adam");
		assertTrue(hotel.checkOut(0));
	}
//	@Test
//	void getAvailableRoomsTest(){
//		hotel.getAvailableRoom();
//	}
}
