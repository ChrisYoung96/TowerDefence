package BaseClass;

/**
 * Created by MFunction on 2017/4/15.
 *
 * @author MFunction
 *         点类，描述某对象的坐标的基础类
 */
public class Location {
    private int _x, _y;

    /**
     * 构造点对象
     *
     * @param x 点对象的横坐标
     * @param y 点对象的纵坐标
     */
    public Location(int x, int y) {
        _x = x;
        _y = y;
    }

    /**
     * 点对象的加操作
     *
     * @param p 点对象的相加对象
     * @return 返回加操作后的点对象
     */
    public Location Add(final Location p) {
        return new Location(_x + p._x, _y + p._y);
    }

    /**
     * 判断两点坐标是否相同
     *
     * @param p 另一点对象
     * @return 返回boolean类型，true为两点相同，否则两点不同
     */
    public boolean Equal(final Location p) {
        return _x == p._x && _y == p._y;
    }

    /**
     * 获取点对象横坐标
     *
     * @return 点对象的横坐标
     */
    final public int x() {
        return _x;
    }

    /**
     * 获取点对象纵坐标
     *
     * @return 点对象的纵坐标
     */
    final public int y() {
        return _y;
    }
}
