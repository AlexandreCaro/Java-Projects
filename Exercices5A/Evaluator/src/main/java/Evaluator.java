package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Evaluator {

    public BiFunction<Boolean, Boolean, Boolean> xor_gate() {
        return (bo1, bo2)->(bo1^bo2);
    }

    public BiFunction<Boolean, Boolean, Boolean> or_gate() {
        return (bo1, bo2)->(bo1 | bo2);
    }

    public BiFunction<Boolean, Boolean, Boolean> and_gate() {
        return (bo1, bo2)->(bo1 & bo2);
    }

    public Function<Boolean, Boolean> not_gate() {
        return (bo)->(!bo);
    }

    // Should return a map containing the computation's results (use HashMap)
    // You're asked to store the results under the following keys: "SUM" & "carry_out"
    // TODO WARNING : ONLY USE the previously defined methods to compute the result
    // (INGInious will prevent you from cheating by directly invoking logical operators)
    public Map<String, Boolean> evaluate_circuit(Boolean a, Boolean b, Boolean carry_in) {

        boolean SUM = xor_gate().apply(xor_gate().apply(a, b), carry_in);
        boolean carry_out = or_gate().apply(and_gate().apply(xor_gate().apply(a, b), carry_in), and_gate().apply(a, b));

        HashMap<String, Boolean> certs = new HashMap<>();

        certs.put("SUM", SUM);
        certs.put("carry_out", carry_out);

        return certs;
    }

}