package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void canCreateVirtualPet() {
        VirtualPet underTest = new VirtualPet("Phauxe", "A fox with bright orange fur.");
        assertEquals("Phauxe", underTest.getPetName());
        assertEquals("A fox with bright orange fur.", underTest.getPetDescription());
        assertEquals(45, underTest.getPetHunger());
        assertEquals(55, underTest.getPetThirst());
        assertEquals(65, underTest.getPetBoredom());
    }

    @Test
    public void canCreateVirtualPetWithAttributes() {
        VirtualPet underTest = new VirtualPet("Phauxe",
                "A fox with bright orange fur.",
                43, 46, 52);
        assertEquals(43, underTest.getPetHunger());
        assertEquals(46, underTest.getPetThirst());
        assertEquals(52, underTest.getPetBoredom());
    }

    @Test
    public void canFeedPet() {
        VirtualPet underTest = new VirtualPet("Phauxe",
                "A fox with bright orange fur.",
                43, 46, 52);
        underTest.feed(5);
        assertEquals(38, underTest.getPetHunger());
    }

    @Test
    public void canWaterPet() {
        VirtualPet underTest = new VirtualPet("Phauxe",
                "A fox with bright orange fur.",
                43, 46, 52);
        underTest.water(5);
        assertEquals(41, underTest.getPetThirst());
    }

    @Test
    public void canPlayWithPet() {
        VirtualPet underTest = new VirtualPet("Phauxe",
                "A fox with bright orange fur.",
                43, 46, 52);
        underTest.play(5);
        assertEquals(47, underTest.getPetBoredom());
    }

    @Test
    public void petCanTick() {
        VirtualPet underTest = new VirtualPet("Phauxe",
                "A fox with bright orange fur.",
                43, 46, 52);
        underTest.tick();
        assertEquals(48, underTest.getPetHunger());
    }
}
