## Drzewo wyszukiwań binarnych (Binary Search Tree, BST)

BST to struktura danych w formie drzewa binarnego, które spełnia określone zasady dotyczące organizacji węzłów. Każdy węzeł w BST ma maksymalnie dwóch potomków i zachowuje specyficzny porządek:

### Node (Węzeł) w drzewie
- **Node** to podstawowa jednostka w drzewie, której struktura wygląda następująco:
  - **value**: Wartość przechowywana w węźle.
  - **left**: Lewy potomek, który jest również węzłem.
  - **right**: Prawy potomek, który jest również węzłem.

### Zasady BST
1. **Root**: BST zaczyna się od korzenia (root), który jest pierwszym i najwyżej położonym węzłem w drzewie.
2. **Porządek węzłów**:
   - Dla każdego węzła `Node`:
     - Wartość w lewym potomku (`left`) jest mniejsza od wartości w węźle `Node`.
     - Wartość w prawym potomku (`right`) jest większa od wartości w węźle `Node`.

### Przykład BST
```
        10
       /  \
      5   15
     / \    \
    3   7    20
```
W tym przykładzie:
- Korzeniem jest węzeł z wartością 10.
- Węzeł z wartością 5 jest lewym potomkiem korzenia i jest mniejszy niż 10.
- Węzeł z wartością 15 jest prawym potomkiem korzenia i jest większy niż 10.
- Ta zasada jest stosowana rekurencyjnie dla każdego węzła w drzewie.

### Zastosowanie BST
Dzięki powyższym zasadom BST umożliwia efektywne wyszukiwanie, dodawanie i usuwanie węzłów. Dodatkowo, jeśli przejdziemy przez drzewo w sposób zwany **in-order traversal** (lewy węzeł, węzeł, prawy węzeł), uzyskamy posortowaną listę wartości przechowywanych w drzewie.

### Implementacje przechodzenia przez drzewo
1. **In-order Traversal** (przechodzenie w kolejności):
   - Przechodzi przez lewe poddrzewo, potem odwiedza węzeł, a następnie przechodzi przez prawe poddrzewo. (Przydatne do zwracania posortowanych wartości, ze względu na odwiedzanie węzłów od najmniejszej wartości do największej. UWAGA można też zastosować odwrotne podejście, wtedy możemy sortować malejąco).
2. **Pre-order Traversal** (przechodzenie w przód):
   - Odwiedza węzeł, a następnie przechodzi przez lewe i prawe poddrzewo. (Przydatne do kopiowania drzewa, ze względu na zaczęcie odwiedzania węzłów od samego początku, czyli pozwala na odwzrorowanie struktury drzewa).
3. **Post-order Traversal** (przechodzenie w tył):
   - Przechodzi przez lewe i prawe poddrzewo, a na końcu odwiedza węzeł. (Przydatne do usuwania drzewa, ze względu na zaczęcie odwiedzania od samego dołu, czyli pozwala na usuwanie węzłów bez zbędnych operacji ustawiania potomków po usunięciu węzła ze środka struktury).
(`"Odwiedza węzeł - ingerencja w wartość węzła"`).

### Metoda updateValue()

Implementacje tej metody pomijam w tym opracowaniu, ze wzgledu na to że chciałbym się skupić tutaj na czystyej logice algorytmów, a metoda update nie wymaga żadnej skomplikowanej do zrozumienia implementacji, ponieważ polegałaby ona tylko i wyłacznie na usunięciu wartości update-owanej i dodaniu wartości zastępczej, co za tym idzie, te metody mamy już zaimplementowane a użycie ich po prostu w innej metodzie nie wnosi nam nic przydatnego do tego wpisu, zatem to zostaje pominięte lecz uświadomione tym, którzy mieliby jakiekolwiek wątpliwości :D 
