class Solution {
    public String sortVowels(String s) {
   //  String abc = "lEetcOde";
Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

List<Character> vowelList = s.chars()
        .filter(c -> vowels.contains((char) c))
        .sorted()
        .mapToObj(i -> (char) i)
        .collect(Collectors.toList());

int[] i = {0}; // Using an array to make it mutable
StringBuilder result = new StringBuilder();

s.chars().forEach(cha -> {
    char character = (char) cha;
    if (!vowels.contains(character)) {
        result.append(character);
    } else {
        result.append(vowelList.get(i[0]++));
    }
});

return (result.toString());
   
    }
}
