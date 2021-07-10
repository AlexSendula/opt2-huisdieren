package tests;

import com.company.Eigenaar;
import com.company.dier.Hond;
import com.company.dier.Kat;
import com.company.dier.Slang;
import com.company.dier.Vis;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class EigenaarTest {
    private final ByteArrayOutputStream outContent  = new ByteArrayOutputStream();
    private final PrintStream originalOut  = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent ));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void slangenOverzicht() {
        Eigenaar test = new Eigenaar("Test", 20);

        Slang slang1 = new Slang("slang1", 1, true, 11.1, false);
        Slang slang2 = new Slang("slang2", 2, false, 22.2, false);
        Slang slang3 = new Slang("slang3", 3, true, 33.3, true);

        test.slangen.add(slang1);
        test.slangen.add(slang2);
        test.slangen.add(slang3);

        test.loopHuisdieren("slang");
        String output = outContent.toString();
        assertEquals("Test heeft 3 slangen.\n" +
                "slang1, slang2, slang3\r\n", output);
    }

    @Test
    public void vissenOverzicht() {
        Eigenaar test = new Eigenaar("Test", 20);

        Vis vis1 = new Vis("vis1", 1, true, 11.1, false);
        Vis vis2 = new Vis("vis2", 2, false, 22.2, false);
        Vis vis3 = new Vis("vis3", 3, true, 33.3, true);

        test.vissen.add(vis1);
        test.vissen.add(vis2);
        test.vissen.add(vis3);

        test.loopHuisdieren("vis");
        String output = outContent.toString();
        assertEquals("Test heeft 3 vissen.\n" +
                "vis1, vis2, vis3\r\n", output);
    }

    @Test
    public void hondenOverzicht() {
        Eigenaar test = new Eigenaar("Test", 20);

        Hond hond1 = new Hond("hond1", 1, true, 4, "Blauw");
        Hond hond2 = new Hond("hond2", 2, false, 3, "Bruin");
        Hond hond3 = new Hond("hond3", 3, true, 4, "Groen");

        test.honden.add(hond1);
        test.honden.add(hond2);
        test.honden.add(hond3);

        test.loopHuisdieren("hond");
        String output = outContent.toString();
        assertEquals("Test heeft 3 honden.\n" +
                "hond1, hond2, hond3\r\n", output);
    }

    @Test
    public void kattenOverzicht() {
        Eigenaar test = new Eigenaar("Test", 20);

        Kat kat1 = new Kat("kat1", 1, true, 4, false, "Grijs");
        Kat kat2 = new Kat("kat2", 2, false, 4, false, "Bruin");
        Kat kat3 = new Kat("kat3", 3, true, 4, true, "Zwart");

        test.katten.add(kat1);
        test.katten.add(kat2);
        test.katten.add(kat3);

        test.loopHuisdieren("kat");
        String output = outContent.toString();
        assertEquals("Test heeft 3 katten.\n" +
                "kat1, kat2, kat3\r\n", output);
    }

    @Test
    public void soortChecker() {
        Eigenaar test = new Eigenaar("Test", 20);

        assertEquals(Eigenaar.Soort.SLANG, test.soortChecker("slang"));
        assertEquals(Eigenaar.Soort.VIS, test.soortChecker("vis"));
        assertEquals(Eigenaar.Soort.HOND, test.soortChecker("hond"));
        assertEquals(Eigenaar.Soort.KAT, test.soortChecker("kat"));
    }


}
