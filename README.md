Żeby uruchomić projekt rozruchowy:
1. Użyj opcji *„Import project from existing sources”* z IntelliJ IDEA (wystarczy Community)
1. Wybierz podczas importu opcję *Maven* i przeklikaj do końca **wybierając Javę w wersji 11**, a poza tym używając domyślnych opcji
1. Powinieneś/Powinnaś otrzymać projekt o 3 modułach `domain`, `app` oraz `adapters`, który się kompiluje (użyj *Build project* w menu *Build* żeby to sprawdzić)
1. Znajdź w module `app` podfolder `src/test/groovy`, kliknij w niego prawym przyciskiem i wybierz *Mark Directory as: „Test sources root"*
1. Powinieneś/Powinnaś być w stanie uruchomić z sukcesem test `AppTest` w tym folderze. 
1. Jeśli masz problem z punktem powyżej upewnij się, że masz w swoim IntelliJ IDEA wsparcie dla Groovy’ego - jeśli nie, zainstaluj plugin wd. instrukcji tutaj: https://www.jetbrains.com/help/idea/groovy.html#d272979e9
1. Upewnij się, że opcja *"Annotation processing"* jest włączona. Jest ona wymagana przez plugin Lombok. Żeby to sprawdzić wyszukaj akcję (Ctrl - Shift - A) *"Enable annotation processing"*
