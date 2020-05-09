package playground;

import playground.models.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Names {

    public static List<String> createEmail(List<Name> input) {
        List<String> result = new ArrayList<>();
        for (Name name : input) {
            result.add(toEmail(name));
        }
        return result;
    }

    public static List<String> createEmailFunctional(List<Name> input) {
        return input
                .stream()
                .map(Names::toEmail)
                .collect(Collectors.toList());
    }

    private static String toEmail(Name i) {
        return String.format(
                "%s.%s@work.com",
                i.getFirst().toLowerCase(),
                i.getLast().toLowerCase()
        );
    }
}
