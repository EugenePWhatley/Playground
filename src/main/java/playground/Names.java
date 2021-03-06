package playground;

import playground.models.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static playground.models.Sex.MALE;

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

    public static List<Name> removeMales(List<Name> input) {
        List<Name> result = new ArrayList<>();
        for (Name name : input) {
            if (isNotMale(name)) result.add(name);
        }
        return result;
    }

    public static List<Name> removeMalesFunctional(List<Name> input) {
        return input
                .stream()
                .filter(Names::isNotMale)
                .collect(Collectors.toList());
    }

    private static boolean isNotMale(Name name) {
        return !isMale(name);
    }

    private static boolean isMale(Name name) {
        return name.getSex().equals(MALE);
    }
}
