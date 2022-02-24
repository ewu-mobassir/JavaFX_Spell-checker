package sample;

public class lnode {
    public lnode a, b, c, d, e, f , g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, parent;
    private String currentWord;
    private boolean endOfWord;

    lnode() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.parent = null;
        this.currentWord = "";
        this.endOfWord = false;
    }

    void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public lnode getParent() {
        return this.parent;
    }

    public void setParent(lnode parent) {
        this.parent = parent;
    }

    public String getCurrentWord() {
        return this.currentWord;
    }


    public boolean isEndOfWord() {
        return this.endOfWord;
    }
}
