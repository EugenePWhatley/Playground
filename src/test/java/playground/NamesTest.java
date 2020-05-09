package playground;

import org.junit.jupiter.api.Test;
import playground.models.Name;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class NamesTest {

    private final List<Name> names = Arrays.asList(
            new Name("He", "Him"),
            new Name("She", "Her"),
            new Name("They", "Them")
    );

    @Test
    void createEmailForName() {
        List<String> expected = Arrays.asList(
                "he.him@work.com",
                "she.her@work.com",
                "they.them@work.com"
        );

        assertThat(
                Names.createEmail(names),
                is(expected)
        );

        assertThat(
                Names.createEmailFunctional(names),
                is(expected)
        );
    }
}