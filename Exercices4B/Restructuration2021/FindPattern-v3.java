public class FindPattern {
    // Idem versions 1 and 2
    private static boolean compare(int[] a,
                                   int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    private static final int MAX_ELEMENT = 15;

    public static int[] getSignature(int[] sequence,
                                     int length) {
        int signature[] = new int[MAX_ELEMENT + 1];
        
        for (int i = 0; i < length; i++) {
            signature[sequence[i]] ++;
        }

        return signature;
    }

    public static int find(int [] pattern, int [] sequence) {
        if (sequence.length < pattern.length) {
            return -1;
        }

        int[] patternSignature = getSignature(pattern, pattern.length);
        int[] sequenceSignature = getSignature(sequence, pattern.length);

        if (compare(patternSignature, sequenceSignature)) {
            return 0;
        }
        
        for (int i = 1; i <= sequence.length - pattern.length; i++) {
            // Update the signature
            sequenceSignature[sequence[i - 1]] --;
            sequenceSignature[sequence[i - 1 + pattern.length]] ++;

            if (compare(patternSignature, sequenceSignature)) {
                return i;
            }
        }

        return -1;
    }
}
