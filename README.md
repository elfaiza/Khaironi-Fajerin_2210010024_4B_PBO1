# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Pariwisata menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama,kode dan wisata Pariwisata, dan memberikan output berupa informasi detail dari KODE tersebut seperti tahun release, kecamatan dan kendaraan

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pariwisata`, `PariwisataDetail`, dan `PariwisataRecomend` adalah contoh dari class.

```bash
public class Pariwisata {
    ...
}

public class PariwisataDetail extends Pariwisata {
    ...
}

public class PariwisataRecomend {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new PariwisataDetail(nama, kode, wisata);` adalah contoh pembuatan object.

```bash
mhs[i] = new PariwisataDetail(nama, kode, wisata);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `kode` dan ‘wisata’ adalah contoh atribut.

```bash
String nama;
String kode;
String wisata;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pariwisata` dan `PariwisataDetail`.

```bash
public Pariwisata(String nama, String kode, String wisata) {
    this.nama = nama;
    this.kode = kode;
    this.wisata = wisata;
}

public PariwisataDetail(String nama, String kode ,String wisata) {
    super(nama, kode, wisata);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setKode`, ‘setwisata’ adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(String kode) {
    this.kode = kode;
}
public void setWisata (String wisata) {
        this.wisata = wisata;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKode`, `getTahunRelease`, `getWisata`, `getKec`, dan `getKend` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKode() {
    return kode;
}
public String getWisata() {
        return wisata;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
private String wisata;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PariwisataDetail` mewarisi `Pariwisata` dengan sintaks `extends`.

```bash
public class PariwisataDetail extends Pariwisata {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pariwisata` merupakan overloading method `displayInfo` dan `displayInfo` di `PariwisataDetail` merupakan override dari method `displayInfo` di `Pariwisata`.

```bash
public String displayinfo (String jarak){
        return displayinfo() + "\nJarak: "+jarak;

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
public String getKec (){
        String kodeKec = getKode().substring(0, 2);
        if(kodeKec.equals("10")){
            return "Kecamatan Batu Benawa";
        } else {
            return "Kecamatan Lain";
        }
    }
    
    public String getKend(){
        //seleksi swicth
        String kodeKend = getKode().substring(4, 6);
        switch(kodeKend){
            case "01":
                return "Semua Kendaraan";
            case "02":
                return "Cuma Roda 2";
            default:
                return "Jalan Kaki Saja";
           
         }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < Pariwisata.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pariwisata ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Pariwisata:");
System.out.println(Pariwisata.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PariwisataDetail[] pws = new PariwisataDetail[2];` adalah contoh penggunaan array.

```bash
PariwisataDetail[] pws = new PariwisataDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
}catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan Umum"+e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Khaironi Fajerin
KODE: 2210010024
