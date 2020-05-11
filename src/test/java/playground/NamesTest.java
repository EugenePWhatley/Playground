package playground;

import org.junit.jupiter.api.Test;
import playground.models.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static playground.models.Sex.*;

class NamesTest {

    private final List<Name> names = Arrays.asList(
            new Name("He", "Him", MALE),
            new Name("She", "Her", FEMALE),
            new Name("They", "Them", NONBINARY)
    );

    @Test
    void shouldCreateEmailForName() {
        List<String> expected = Arrays.asList(
                "he.him@work.com",
                "she.her@work.com",
                "they.them@work.com"
        );

        assertThat(Names.createEmail(names))
                .isEqualTo(expected);

        assertThat(Names.createEmailFunctional(names))
                .isEqualTo(expected);
    }

    @Test
    void shouldFilterOutMales() {
        List<Name> expected = new ArrayList<>() {{
            add(new Name("She", "Her", FEMALE));
            add(new Name("They", "Them", NONBINARY));
        }};

        assertThat(Names.removeMales(names))
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(expected);

        assertThat(Names.removeMalesFunctional(names))
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(expected);
    }
}