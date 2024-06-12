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
   - Przechodzi przez lewe poddrzewo, potem odwiedza węzeł, a następnie przechodzi przez prawe poddrzewo. Daje posortowaną kolejność wartości.
2. **Pre-order Traversal** (przechodzenie w przód):
   - Odwiedza węzeł, a następnie przechodzi przez lewe i prawe poddrzewo. Używane często do kopiowania drzewa.
3. **Post-order Traversal** (przechodzenie w tył):
   - Przechodzi przez lewe i prawe poddrzewo, a na końcu odwiedza węzeł. Używane do usuwania drzewa.