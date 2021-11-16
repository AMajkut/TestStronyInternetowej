#  Test strony internetowej


Skrypt:
- loguje się do istnejącego użytkownika,
- tworzy nowy adres przesyłki na koncie użytkownika,
- wypełnia formularz New address (dane są pobierane z tabeli Examples w Gherkinie - alias, address, city, zip code, country, phone),
- sprawdza czy adres został dodany poprawnie,
- użytkownik zostaje wylogowany.

Po ponownym zalogowniu skrypt:
- wybierze do zakupu Hummingbird Printed Sweater, sprawdza czy rabat na niego wynosi 20%,
- wybierze rozmiar M ze sparametryzowanej opcji: S,M,L,XL,
- wybierze 5 sztuk według parametru podanego w teście,
- doda produkty do koszyka,
- przejdzie do opcji checkout,
- potwierdzi adres,
- wybierze metodę odbioru - PrestaShop "pick up in store",
- wybierze opcję płatności - Pay by Check,
- kliknie na "order with an obligation to pay",
- zrobi screenshot z potwierdzeniem zamówienia i kwotą,
- użytkownik zostaje wylogowany.
