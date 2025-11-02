package warehouse.ssa.application.interfaces;

public interface UseCase<I, O> {
   O execute(I input);
}
