public class Main {
    public static void main(String[] args) {
        Tendik tdk = new Tendik();
        tdk.setNama("Jordi Elvyto");
        tdk.setNip(21123122);
        tdk.setTglLahir("11/12/1997");
        tdk.setAlamat("Yogyakarta");
        tdk.setJenkel("Laki-laki");
        tdk.setThnMasuk(2018);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Teknik Elektro");
        dsn.setNidn(22022012);
        dsn.setNama("Alex Gunawan");
        dsn.setNip(21212223);
        dsn.setTglLahir("08/08/1988");
        dsn.setAlamat("Lampung");
        dsn.setJenkel("Laki-laki");
        dsn.setThnMasuk(2015);

        System.out.println("Nama Tendik          : " + tdk.getNama());
        System.out.println("NIP Tendik           : " + tdk.getNip());
        System.out.println("Alamat               : " + tdk.getAlamat());
        System.out.println("Tanggal Lahir        : " + tdk.getTglLahir());
        System.out.println("Jenis Kelamin        : " + tdk.getJenkel());
        System.out.println("Tahun Masuk          : " + tdk.getThnMasuk());
        System.out.println("Gaji Pokok           : " + tdk.gajiTotal());
        System.out.println("Gaji Lembur (20 jam) : " + tdk.lembur(20));
        System.out.println("Gaji Total           : " + tdk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen            : " + dsn.getNama());
        System.out.println("NIDN                  : " + dsn.getNidn());
        System.out.println("Jurusan               : " + dsn.getJurusan());
        System.out.println("NIP Dosen             : " + dsn.getNip());
        System.out.println("Alamat                : " + dsn.getAlamat());
        System.out.println("Tanggal Lahir         : " + dsn.getTglLahir());
        System.out.println("Jenis Kelamin         : " + tdk.getJenkel());
        System.out.println("Tahun Masuk           : " + dsn.getThnMasuk());
        System.out.println("Gaji Pokok            : " + dsn.gajiTotal());
        System.out.println("Tambahan Gaji (6 SKS) : " + dsn.tambahGaji(6));
        System.out.println("Gaji Total            : " + dsn.gajiTotal(6));

    }
}