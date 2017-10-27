#include <iostream>
#include <cstdio>
#include <cctype>
#include <algorithm>
#include <cstring>
#include <string>
#include <cmath>
#include <vector>
#include <set>
#include <stack>
#include <sstream>
#include <queue>
#include <map>
#include <functional>
#include <bitset>
//#include <unordered_map>
//#include <unordered_set>

using namespace std;
#define ll long long
#define ull unsigned long long
#define pii pair<int, int>
#define pb push_back
#define mk make_pair
#define fi first
#define se second
#define mid(l,r) ((l)+((r)-(l))/2)
#define ALL(A) A.begin(), A.end()
#define rep(i,n) for(int (i)=0;(i)<(int)(n);(i)++)
#define repr(i,n) for(int (i)=(int)(n);(i)>=0;(i)--)
#define repab(i,a,b) for(int (i)=(int)(a);(i)<=(int)(b);(i)++)
#define reprab(i,a,b) for(int (i)=(int)(a);(i)>=(int)(b);(i)--)
#define sc(x) scanf("%d", &x)
#define pr(x) printf("x:%dn", x)
#define fastio ios::sync_with_stdio(0),cin.tie(0)
#define frein freopen("in.txt", "r", stdin)
#define freout freopen("out.txt", "w", stdout)
#define freout1 freopen("out1.txt", "w", stdout)
#define lson(rt) (rt*2+1)
#define rson(rt) (rt*2+2)
#define debug cout<<"???"<<endl
#define PI 3.1415926535897932
const ll mod = 1000000007;
const ll INF = 0x3f3f3f3f;
const ll INF64 = 1223372036854775807;
const double eps = 1e-7;
template<class T> T gcd(T a, T b){if(!b)return a;return gcd(b,a%b);}
int n, m;
const int maxn = 1e5 + 10;
const int ST_SIZE = (1 << 18) - 1;
vector<int> dat[ST_SIZE];
int A[maxn];
int nums[maxn];

void init(int k, int l, int r)
{
    if(r - l == 1){
        dat[k].pb(A[l]);
    }
    else{
        int lch = k * 2 + 1, rch = k * 2 + 2;
        init(lch, l, (l + r) / 2);
        init(rch, (l + r) / 2, r);
        dat[k].resize(r - l);
        merge(ALL(dat[lch]), ALL(dat[rch]), dat[k].begin());
    }
}

int query(int i, int j, int x, int k, int l, int r)
{
    if(j <= l || r <= i)return 0;
    else if(i <= l && r <= j){
        return upper_bound(ALL(dat[k]), x) - dat[k].begin();
    }
    else{
        int lc = query(i, j, x, k * 2 + 1, l, (l + r) / 2);
        int rc = query(i, j, x, k * 2 + 2, (l + r) / 2, r);
        return lc + rc;
    }
}

void solve()
{
    for(int i = 0; i < n; i++){
        scanf("%d", &A[i]);
        nums[i] = A[i];
    }
    sort(nums, nums + n);
    init(0, 0, n);
    for(int i = 0; i < m; i++){
        int l, r, k;
        scanf("%d%d%d", &l, &r, &k);
        l--;
        int ls = 0, rs = n - 1, ans = 0;
        while(ls <= rs){
            int mid = (ls + rs) / 2;
            int c = query(l, r, nums[mid], 0, 0, n);
            if(c >= k){
                rs = mid - 1;
                ans = mid;
            }
            else ls = mid + 1;
        }
        printf("%d\n", nums[ans]);
    }
}

int main()
{
    //frein;
    //freout;
    sc(n);sc(m);
    solve();
}


