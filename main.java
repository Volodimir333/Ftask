public class main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Добавляем слова в дерево
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apricot");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("bad");


        // Проверяем наличие слов
        System.out.println("Search 'apple': " + trie.search("apple"));  // true
        System.out.println("Search 'app': " + trie.search("app"));      // true
        System.out.println("Search 'apricot': " + trie.search("apricot")); // true
        System.out.println("Search 'banana': " + trie.search("banana")); // true
        System.out.println("Search 'bat': " + trie.search("bat"));     // true
        System.out.println("Search 'bad': " + trie.search("bad"));  // true

        System.out.println("Search 'ap': " + trie.search("ap"));       // false
        System.out.println("Search 'ban': " + trie.search("ban"));     // false
        System.out.println("Search 'ba': " + trie.search("ba"));    // false
        System.out.println("Search 'abcd': " + trie.search("abcd"));   // false

        // Проверяем наличие префикса
        System.out.println("Starts with 'app': " + trie.startsWith("app")); // true
        System.out.println("Starts with 'ap': " + trie.startsWith("ap")); // true
        System.out.println("Starts with 'ba': " + trie.startsWith("ba")); // true
        System.out.println("Starts with 'ban': " + trie.startsWith("ban")); // true
        System.out.println("Starts with 'bat': " + trie.startsWith("bat")); // true

        System.out.println("Starts with 'b': " + trie.startsWith("b"));  // true
        System.out.println("Starts with 'ab': " + trie.startsWith("ab")); // false
        System.out.println("Starts with 'xyz': " + trie.startsWith("xyz")); // false
    }
}