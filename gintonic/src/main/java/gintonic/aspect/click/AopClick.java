package gintonic.aspect.click;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by zhibao.Liu on 2018/9/25.
 *
 * @version :
 * @date : 2018/9/25
 * @des :
 * @see{@link}
 */
@Aspect
public class AopClick {

    private static final String POINTCUT_METHOD_VIEW_ONCLICK = "execution(* android.view.View.OnClickListener.onClick(..))";
    @Pointcut(POINTCUT_METHOD_VIEW_ONCLICK)
    public void methodOnClick(){

    }

    @Pointcut("execution(* android.view.View.OnClickListener.onClick(..))")

    @After("methodOnClick()")
    public void onViewClickAfter(JoinPoint joinPoint) throws Throwable {
        Log.e("onViewClickAfter:","liuzhibao onClick is end .");
    }

    @Before("execution(* android.view.View.OnClickListener.onClick(..))")
    public void onViewClickBefore(JoinPoint joinPoint) throws Throwable {
        Log.e("onViewClickAfter:","liuzhibao onClick is before .");
    }

}
