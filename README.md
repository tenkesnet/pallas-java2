# Java Beckend + Tester

## Linkek
- [WAMP](https://bitnami.com/stack/wamp/installer)

## Vátozó típusok

Primitívek:

|type|alapérték|hossz|tartomány|
|----|---|----|----|
|byte                    |0               |8  bit |( -128-127 ; -2^7 - 2^7-1)|
|short                    |0               |16 bit |(-32768 - 32767 ; -2^15 - 2^15-1 )|
|int                    |0               |32 bit |(-2^31 - 2^31-1)|
|long                    |0L              |64 bit |(-2^63 - 2^63-1)|
|float                    |0.0f            |32 bit |(1.40239846 x 10^-45 - 3.40282347 x 10^38)|
|double                    |0.0d            |64 bit |(4.9406564584124654 x 10^-324 - 1.7976931348623157 x 10^308)|
|char                    |'\u0000'        |16 bit |(0 - 2^16– 1)|
|boolean                |false           |1  bit |(0-1)|

Referencia Típusok:

String (or any object)   null

## OOP alapelvek

1. Egységbezárás (Encapsulation)

    Azt jelenti, hogy az adatstruktúrákat és az adott struktúrájú adatokat kezelő függvényeket (metódusokat) kombináljuk. Azokat egy egységként kezeljük, és elzárjuk őket a külvilág elől. Az így kapott egységeket objektumoknak nevezzük.

2. Öröklés (Inheritance)

    Azt takarja, hogy a meglévő objektumokból levezetett újabb objektumok öröklik a definiálásukhoz használt alap objektumok egyes adatstruktúráit és függvényeit, ugyanakkor újabb tulajdonságokat is definiálhatnak, vagy régieket újraértelmezhetnek.

3. Többalakúság (polimorfizmus)

    Egy adott tevékenység (metódus) azonosítója közös lehet egy adott objektum hierarchián belül, ugyanakkor a hierarchia minden egyes objektumában a tevékenységeket végrehajtó metódus implementációja az adott objektumra nézve specifikus lehet.

## Szerializáció
...

...
## Deszerializáció
```
ArrayList<User> users = null;
ObjectMapper objectMapper = new ObjectMapper();

try {

    users = objectMapper.readValue(jsonText,
            new TypeReference<ArrayList<User>>() {
            });

} catch (IOException e) {
    e.printStackTrace();
}
```

