1. **Mengapa termasuk overloading?**
   Constructor `Mahasiswa(nama, nim)` dan `Mahasiswa(nama, nim, umur)` memiliki nama sama (nama class) dalam satu class, tetapi daftar parameternya berbeda. dan juga tiga method `setBiodata()` yang bernama sama namun parameternya berbeda.

2. **Perbedaan signature `setBiodata()`:**
   - `setBiodata(String nama)` → 1 parameter
   - `setBiodata(String nama, String nim)` → 2 parameter
   - `setBiodata(String nama, String nim, int umur)` → 3 parameter
   Signature method = nama method + urutan, jumlah, dan tipe parameter.

3. **`(String nama, int umur)` vs `(String nama, int usia)`:**
   Bukan overloading. Nama parameter tidak termasuk signature. Keduanya bertipe `(String, int)` sehingga signature-nya identik, dan compiler menolaknya dengan error *"method is already defined"*.
