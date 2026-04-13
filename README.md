# arrylist
#  Tugas Praktikum Week 5

## Array dan ArrayList (Java)

###  Nama/NIM 
Muhammad Dhiyaul Haq 2902736934

---

##  Deskripsi

Program ini dibuat untuk mengimplementasikan operasi dasar pada **Array** dan **ArrayList** menggunakan bahasa Java, serta membandingkan kinerja keduanya berdasarkan waktu eksekusi.


##  Fitur Program

 Array

* Traversal (menampilkan data)
* Linear Search
* Binary Search
* Insert (penyisipan data)
* Delete (penghapusan data)

###  ArrayList

* Add (menambah data)
* Remove (menghapus data)
* Search (mencari data)
* Sort (mengurutkan data)

---

##  Cara Menjalankan Program

1. Compile semua file:

```bash
javac *.java
```

2. Jalankan program:

```bash
java Comparison
```

---

##  Contoh Output

```
Array Traversal: [10, 20, 30, 40, 50]
ArrayList Traversal: [10, 20, 30, 40, 50]

Search Array index: 2
Search ArrayList index: 2

Array setelah insert: [10, 20, 25, 30, 40, 50]
ArrayList setelah insert: [10, 20, 25, 30, 40, 50]

Array setelah delete: [10, 20, 30, 40, 50]
ArrayList setelah delete: [10, 20, 30, 40, 50]
```

---

##  Analisis

* **Array**

  * Akses data cepat (O(1))
  * Insert dan delete lebih lambat (O(n))

* **ArrayList**

  * Lebih fleksibel (dynamic size)
  * Lebih mudah digunakan
  * Sedikit lebih besar penggunaan memori

---

##  Kesimpulan

Array cocok digunakan jika membutuhkan akses data yang cepat dan ukuran tetap, sedangkan ArrayList lebih cocok untuk data yang dinamis karena lebih fleksibel dalam penambahan dan penghapusan data.

---

##  Catatan

Program menggunakan `System.nanoTime()` untuk mengukur waktu eksekusi agar dapat membandingkan performa antara Array dan ArrayList.

---

