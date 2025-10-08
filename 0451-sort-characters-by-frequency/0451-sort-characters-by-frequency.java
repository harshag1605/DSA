class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(freq.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}