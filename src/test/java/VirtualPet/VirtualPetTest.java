package VirtualPet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import VirtualPet.VirtualPet;

public class VirtualPetTest {
	int currentHunger = 50;
	int currentThirst = 70;
	int currentWaste = 50;
	int currentBoredom = 50;
	int currentSickness = 30;
	int currentTiredness = 50;
	private VirtualPet underTest = new VirtualPet(currentHunger, currentThirst, currentWaste, currentBoredom,
			currentSickness, currentTiredness);

	@Test
	public void shouldDecreaseHungerFrom50To30WhenFed() {
		underTest.feed(20);
		int check = underTest.getCurrentHunger();
		assertThat(check, is(30));

	}

	@Test
	public void shouldDecreaseThirstFrom70To50WhenGivenWater() {
		underTest.giveWater(20);
		int check = underTest.getCurrentThirst();
		assertThat(check, is(50));

	}

	@Test
	public void shouldDecreaseWasteFrom50To10WhenTakenOut() {
		underTest.takenOut(40);
		int check = underTest.getCurrentWaste();
		assertThat(check, is(10));
	}

	@Test
	public void shouldDecreaseBoredomFrom50To20WhenPlayedWith() {
		underTest.playWith(30);
		int check = underTest.getCurrentBoredom();
		assertThat(check, is(20));

	}

	@Test
	public void shouldDecreaseSicknessFrom30To10WhenTakenToVet() {
		underTest.takeToVet(20);
		int check = underTest.getCurrentSickness();
		assertThat(check, is(10));
	}

	@Test
	public void shouldDecreaseTirednessFrom50To20WhenPutToSleep() {
		underTest.putToSleep(30);
		int check = underTest.getCurrentTiredness();
		assertThat(check, is(20));
	}

	@Test
	public void shouldIncreaseThirstFrom70To100WhenFed() {
		underTest.feed(30);
		int check = underTest.getCurrentThirst();
		assertThat(check, is(100));
	}

	@Test
	public void shouldIncreaseTirednessFrom50To70WhenAtPlay() {
		underTest.playWith(20);
		int check = underTest.getCurrentTiredness();
		assertThat(check, is(70));
	}

	@Test
	public void shouldIncreaseWasteFrom50To80WhenFed() {
		underTest.feed(30);
		int check = underTest.getCurrentWaste();
		assertThat(check, is(80));
	}

	@Test
	public void shouldIncreaseBoredomBy10WhenTick() {
		underTest.tick();
		int check = underTest.getCurrentBoredom();
		assertThat(check, is(60));
	}

	@Test
	public void shouldIncreaseHungerBy10WhenTick() {
		underTest.tick();
		int check = underTest.getCurrentHunger();
		assertThat(check, is(60));

	}

	@Test
	public void shouldIncreaseTirednessBy10WhenTick() {
		underTest.tick();
		int check = underTest.getCurrentTiredness();
		assertThat(check, is(60));
	}

}
