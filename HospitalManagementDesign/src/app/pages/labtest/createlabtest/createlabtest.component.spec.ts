import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatelabtestComponent } from './createlabtest.component';

describe('CreatelabtestComponent', () => {
  let component: CreatelabtestComponent;
  let fixture: ComponentFixture<CreatelabtestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreatelabtestComponent]
    });
    fixture = TestBed.createComponent(CreatelabtestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
