package BaseClass;

import java.util.UUID;

/**
 * Created by MFunction on 2017/4/17.
 * 塔类,描述塔的基本属性的基础类
 *
 * @author 甄焰鑫
 */
abstract public class Tower {
    /**
     * 等级
     */
    protected int _level;
    /**
     * 价格
     */
    protected int _price;
    /**
     * 升级所需价格
     */
    protected int _upprice;
    /**
     * 伤害值
     */
    protected int _damage;
    /**
     * 升级时间
     */
    protected int _uptime;
    /**
     * 升级增加的伤害
     */
    protected int _updmg;
    /**
     * 攻击范围
     */
    protected int _atkarea;
    /**
     * 名称
     */
    protected String _name;
    /**
     * 身份标识
     */
    protected UUID _uuid;
    /**
     * 表现层坐标
     */
    protected Location _surlocation;
    /**
     * 业务层坐标
     */
    protected Location _optlocation;
    /**
     * 攻击目标
     */
    protected Object _target;

    /**
     * 构造基础塔
     *
     * @param name              塔的名称
     * @param level             塔的等级
     * @param damage            塔的伤害值
     * @param price             塔的价格
     * @param upgradePrice      塔的升级价格
     * @param upgradeTime       塔的升级时间
     * @param attackArea        塔的攻击范围
     * @param surfaceLocation   塔的UI位置
     * @param operationLocation 塔的后台操作位置
     * @param target            塔的目标对象
     */
    public Tower(String name, int level, int damage, int price, int upgradePrice, int upgradeTime, int attackArea, Location surfaceLocation, Location operationLocation, Object target) {
        _name = name;
        _uuid = UUID.randomUUID();
        _level = level;
        _damage = damage;
        _price = price;
        _upprice = upgradePrice;
        _uptime = upgradeTime;
        _atkarea = attackArea;
        _surlocation = surfaceLocation;
        _optlocation = operationLocation;
        _target = target;
    }

    /**
     * 获取升级增加的伤害
     *
     * @return 返回增加的伤害
     */
    public final int GetUpDmg() {
        return _updmg;
    }

    /**
     * 获取塔的名称
     *
     * @return 返回塔的名称
     */
    public final String GetName() {
        return _name;
    }

    /**
     * 获取塔的ID
     *
     * @return 返回塔的ID
     */
    public final UUID GetUUID() {
        return _uuid;
    }

    /**
     * 获取塔的等级
     *
     * @return 返回塔的等级
     */
    public final int GetLevel() {
        return _level;
    }

    /**
     * 获取塔的伤害值
     *
     * @return 返回塔的伤害值
     */
    public final int GetDamage() {
        return _damage;
    }

    /**
     * 获取塔的价格
     *
     * @return 返回塔的价格
     */
    public final int GetPrice() {
        return _price;
    }

    /**
     * 获取塔的升级价格
     *
     * @return 返回升级塔的价格
     */
    public final int GetUpgradePrice() {
        return _upprice;
    }

    /**
     * 获取塔的升级时间
     *
     * @return 返回升级塔的时间
     */
    public final int GetUpgradeTime() {
        return _uptime;
    }

    /**
     * 获取塔的攻击范围
     *
     * @return 返回塔的攻击范围
     */
    public final int GetAttackArea() {
        return _atkarea;
    }

    /**
     * 获取塔的UI位置
     *
     * @return 返回塔的UI位置
     */
    public final Location GetSurfaceLocation() {
        return _surlocation;
    }

    /**
     * 获取塔的操作位置
     *
     * @return 返回塔的操作位置
     */
    public final Location GetOperationLocation() {
        return _optlocation;
    }

    /**
     * 提升塔的等级
     */
    public void Upgrade() {
        _level++;
        _damage *= 2;
        _uptime *= 2;
        _price += _uptime;
        _upprice *= 2;
        _atkarea += 1;
    }

    /**
     * 更新塔的目标
     *
     * @param target 更新后塔的目标
     */
    public void UpdateTarget(Object target) {

    }
}
